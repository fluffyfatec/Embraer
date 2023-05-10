package com.embraer.backend.chassisUserPilot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ChassisUserPilotDTO {

    private Long id;
    private String owner;
    private String pilot;
    private Long chassis;
    private String date_register;
    private String status;

}
