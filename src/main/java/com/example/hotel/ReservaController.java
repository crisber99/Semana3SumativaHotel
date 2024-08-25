package com.example.hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class ReservaController {
    private List<Reserva> reserva = new ArrayList<>();

    public ReservaController(){
        reserva.add(new Reserva(1, "Bernardo Bravo", "25/03/2024", "12:30", "", "","Doble", "No", "Efectivo", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia"), new Habitacion("101A", "2", "sucia")), llenarListaDisp("100A", "Disponible") ));
        reserva.add(new Reserva(2, "Francisca Urbina", "26/01/2024", "13:30", "", "","Simple", "No", "Tarjeta de Débito", "987654321", "mail@mail.com",Arrays.asList(new Habitacion("100A", "1", "limpia")), llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(3, "Laura Alegria", "28/02/2024", "14:30", "", "","Matrimonial", "No", "Efectivo", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")), llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(4, "Paz Duran", "12/11/2022", "15:30", "", "","Doble", "No", "Tarjeta de Crédito", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")),  llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(5, "Oriana Yañez", "15/03/2024", "16:30", "", "","Simple", "No", "Efectivo", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")),  llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(6, "Patricio Urzua", "01/08/2023", "17:30", "", "","Matrimonial", "No", "Efectivo", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")),  llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(7, "Fatima Saez", "20/11/2023", "18:30", "", "","Doble", "No", "Tarjeta de Crédito", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")),  llenarListaDisp("100A", "Disponible")));
        reserva.add(new Reserva(8, "Juan Perez", "20/12/2023", "18:30", "", "","Doble", "No", "Tarjeta de Crédito", "987654321", "mail@mail.com", Arrays.asList(new Habitacion("100A", "1", "limpia")),  llenarListaDisp("100A", "Disponible")));
    }

    private Map<String, List<String>> llenarListaDisp(String habitacion, String disponibilidad){
        Map<String, List<String>> retorno = new HashMap<String, List<String>>();

        List<String> dipoList = Arrays.asList(disponibilidad);

        retorno.put(disponibilidad, dipoList);

        return retorno;
    }

    @GetMapping("/reservas/{id}")
    public Reserva getPeliculasByID(@PathVariable int id){
        for (Reserva res : reserva){
            if(res.getIdReserva() == id){
                return res;
            }
        }
        return null;
    }

    @GetMapping("/reservas")
    public List<Reserva> peliculas(){
        return reserva;
    }

    @GetMapping("/reservas/{idReserva}/habitaciones/{habitacion}")
    public String MostrarDisponibilidad(@PathVariable("idReserva") Integer idReserva, @PathVariable("habitacion") String habitacion) {
        String retorno = "";
        for(Reserva res : reserva){
            if(res.getIdReserva() == idReserva){
                List<String> disponibilidad = res.getDisponibilidad().get(habitacion); 
                if(disponibilidad != null){
                    retorno = disponibilidad.toString();    
                }
                else{
                    retorno = "Sin resultado";
                }
                
            }
            
        }
        return retorno;
    }
    
}
