/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author jhanc
 */
public class Ventas {
    private int ID_Venta;
    private int ID_cliente;
    private LocalDate FechaVenta;
    private Double Total;

    public Ventas() {
    }

    public Ventas(int ID_Venta, int ID_cliente, LocalDate FechaVenta, Double Total) {
        this.ID_Venta = ID_Venta;
        this.ID_cliente = ID_cliente;
        this.FechaVenta = FechaVenta;
        this.Total = Total;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public LocalDate getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(LocalDate FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    
    
    
    

    
    
}
