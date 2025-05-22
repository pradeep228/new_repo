/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
// Define main class 
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        SearchService service = new SearchService();

        service.searchAppointments("CUST123", pet);
        
        System.out.println("Search executed.");
    }
}
