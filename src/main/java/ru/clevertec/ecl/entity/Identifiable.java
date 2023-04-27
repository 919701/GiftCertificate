package ru.clevertec.ecl.entity;

import java.io.Serializable;

public interface Identifiable <K extends Serializable> {

    K getId();
}
