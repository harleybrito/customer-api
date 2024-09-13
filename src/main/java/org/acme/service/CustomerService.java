package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dto.CustomerDTO;
import org.acme.entity.CustomerEntity;
import org.acme.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    public List<CustomerDTO> findAllCustomers(){
        List<CustomerDTO> customers = new ArrayList<>();
        this.customerRepository.findAll().stream().forEach(item -> {
            customers.add(this.mapCustomerEntityToDTO(item));
        });
        return customers;
    }

    public void createNewCustomer(CustomerDTO customerDTO) {
        this.customerRepository.persist(this.mapCustomerDTOToEntity(customerDTO));
    }

    public void changeCustomer(Long id, CustomerDTO customerDTO) {
        CustomerEntity customerEntity = this.customerRepository.findById(id);
        customerEntity.setName(customerDTO.getName());
        customerEntity.setAddress(customerDTO.getAddress());
        customerEntity.setPhone(customerDTO.getPhone());
        customerEntity.setEmail(customerDTO.getEmail());
        customerEntity.setAge(customerDTO.getAge());
        this.customerRepository.persist(customerEntity);
    }

    public void deleteCustomer(Long id) {
        this.customerRepository.deleteById(id);
    }

    private CustomerDTO mapCustomerEntityToDTO(CustomerEntity customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setAddress(customer.getAddress());
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setAge(customer.getAge());
        return customerDTO;
    }

    private CustomerEntity mapCustomerDTOToEntity(CustomerDTO customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPhone(customer.getPhone());
        customerEntity.setAge(customer.getAge());
        return customerEntity;
    }
}
