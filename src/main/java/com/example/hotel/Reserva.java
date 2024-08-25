package com.example.hotel;

import java.util.List;
import java.util.Map;

public class Reserva {
    private int idReserva;
    private String nombreCliente;
    private String fechaEntrada;
    private String horaEntreada;
    private String fechaSalida;
    private String horaSalida;
    private String tipoHabitacion;
    private String solicitudEspecial;
    private String opcionPago;
    private String telefono;
    private String mail;
    private List<Habitacion> habitacion;
    private Map<String, List<String>> disponibilidad;

    public Reserva(int idReserva,String nombreCliente,String fechaEntrada,String horaEntreada,String fechaSalida,
    String horaSalida,String tipoHabitacion,String solicitudEspecial,
    String opcionPago,String telefono,String mail, List<Habitacion> habitacion, Map<String, List<String>> disponibilidad){
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.horaEntreada = horaEntreada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.tipoHabitacion = tipoHabitacion;
        this.solicitudEspecial = solicitudEspecial;
        this.opcionPago = opcionPago;
        this.telefono = telefono;
        this.mail = mail;
        this.habitacion = habitacion;
        this.disponibilidad = disponibilidad;
    }

    public int getIdReserva(){
        return idReserva;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getFechaEntrada(){
        return fechaEntrada;
    
    }

    public String getHoraEntreada(){
        return horaEntreada;
    }

    public String getFechaSalida(){
        return fechaSalida;
    }

    public String getHoraSalida(){
        return horaSalida;
    }

    public String getTipoHabitacion(){
        return tipoHabitacion;
    }

    public String getSolicitudEspecial(){
        return solicitudEspecial;
    }

    public String getOpcionPago(){
        return opcionPago;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getMail(){
        return mail;
    }

    public List<Habitacion> getHabitacion(){
        return habitacion;
    }

    public Map<String, List<String>> getDisponibilidad(){
        return disponibilidad;
    }


    
}
