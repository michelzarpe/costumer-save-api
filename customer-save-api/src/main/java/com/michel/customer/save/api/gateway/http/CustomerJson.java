package com.michel.customer.save.api.gateway.http;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
