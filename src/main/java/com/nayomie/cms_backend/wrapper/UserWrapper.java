package com.nayomie.cms_backend.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWrapper {
    private Integer id;
    private String name;
    private String email;
    private String contactNumber;
    private String status;
}
