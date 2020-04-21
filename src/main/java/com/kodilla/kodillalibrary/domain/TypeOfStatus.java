package com.kodilla.kodillalibrary.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TypeOfStatus {
    @JsonProperty("USED")
    USED,
    @JsonProperty("DESTROYED")
    DESTROYED,
    @JsonProperty("LOST")
    LOST
}