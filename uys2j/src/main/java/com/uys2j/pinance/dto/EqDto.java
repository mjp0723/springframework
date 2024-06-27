package com.uys2j.pinance.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EqDto {
	private int eqNo;
	private String eqName;
	private String eqCategory;
	private int eqCount;
	private int eqPrice;
	private String eqBuyplace;
	private String eqReason;
	private String regId;
	private String regTime;
	private String modId;
	private String modTime;
	private String status;
	
	private AttachDto attach;
	private List<AttachDto> attachList;
}