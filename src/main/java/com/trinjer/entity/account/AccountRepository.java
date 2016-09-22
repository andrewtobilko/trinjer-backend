package com.trinjer.entity.account;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * Created by Andrew Tobilko on 9/22/2016.
 *
 */
@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

}
