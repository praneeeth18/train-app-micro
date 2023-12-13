package com.praneeth.traindetailsservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TrainSearchRequest {

	private String source;
	private String destination;
	private String classes;
	private String quota;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String date;
}
