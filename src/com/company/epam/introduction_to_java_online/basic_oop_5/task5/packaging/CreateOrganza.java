package com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging;

import com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging.packagings.Organza;
import com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging.packagings.Packaging;

public class CreateOrganza implements CreatePackaging{
    @Override
    public Packaging createPackaging() {
        return new Organza();
    }
}
