package com.example.Rc.Rc.security.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),
    MANAGER_READ("management:read"),
    MANAGER_UPDATE("management:update"),
    MANAGER_CREATE("management:create"),
    MANAGER_DELETE("management:delete"),
    SUBMANAGER_READ("submanagement:read"),
    SUBMANAGER_UPDATE("submanagement:update"),
    SUBMANAGER_CREATE("submanagement:create"),
    SUBMANAGER_DELETE("submanagement:delete")

    ;

    @Getter
    private final String permission;
}
