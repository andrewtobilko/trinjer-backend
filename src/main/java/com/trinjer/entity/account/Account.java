package com.trinjer.entity.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * Created by Andrew Tobilko on 07/08/16.
 *
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

}
