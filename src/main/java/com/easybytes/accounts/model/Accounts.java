package com.easybytes.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Accounts extends BaseEntity{

    @Column(name="customer_id")
    private Long customerId;
    @Id
    @Column(name="account_number")
    private Long accountNumber;
    @Column(name="account_type")
    private String accountType;
    @Column(name="branch_address")
    private String branchAddress;
}
