package com.ofi.rotamanager.app.shop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Omar Farooq Ilyas on 07.06.2015.
 */
@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;
}
