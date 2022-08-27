package com.futurasoft.proyecto;

public class MovimientoDinero {
    private float MontoMovimiento;
    private String ConceptoMovimiento;
    private Empleado Usuario;

    public float getMontoMovimiento() {return MontoMovimiento;}
    public void setMontoMovimiento(float montoMovimiento) {MontoMovimiento = montoMovimiento;}
    public String getConceptoMovimiento() {return ConceptoMovimiento;}
    public void setConceptoMovimiento(String conceptoMovimiento) {ConceptoMovimiento = conceptoMovimiento;}
    public void setUsuario(Empleado usuario) {Usuario = usuario;}
}
