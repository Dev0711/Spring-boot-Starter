package com.example.account.respository;

import com.example.account.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

    public interface AccountsRespository extends JpaRepository<Accounts, Long> {

    Optional<Object> findByCustomerId(Long customerId);

    @Transactional
    @Modifying

    void deleteByCustomerId(Long customerId);
}


