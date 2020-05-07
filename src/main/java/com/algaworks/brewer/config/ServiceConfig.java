package com.algaworks.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.algaworks.brewer.service.CadastroCevejaService;

@Configuration
@ComponentScan(basePackageClasses = CadastroCevejaService.class)
public class ServiceConfig {

}
