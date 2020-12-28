package com.marcelsouzav.udemy.customer.save.service.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerJson {

    private String uuid;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String contry;

    @NotNull
    @NotEmpty
    private String musicStyle;
}