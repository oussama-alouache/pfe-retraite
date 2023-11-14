package com.example.Rc.Rc.data.common;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter

@EntityListeners(AuditingEntityListener.class)
@Data
@MappedSuperclass
public abstract class Auditable {

    @Id
    @GeneratedValue
    private Integer id;


    @CreatedBy
    @Column (updatable = false)
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;


    @CreatedDate
    @Column (updatable = false)
    private LocalDateTime createdAt;


    @LastModifiedDate
    private LocalDateTime modifiedAt;





}
