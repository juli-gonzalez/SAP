package domain;
import domain.Actuadores.TanqueCloro;
import domain.Actuadores.Termotanque;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSAP {

    //Gyms
    private Gimnasio gimnasioMadyson;
    private Gimnasio gimnasioSharck;

    //Piletas
    private Pileta gymMadysonPileta1;
    private Pileta gymMadysonPileta2;

    private Pileta gymSharckPileta1;
    private Pileta gymSharckPileta2;

    //Sensores
    private Sensor sensorPhGymMadysonPileta1;
    private Sensor sensorTempGymMadysonPileta1;

    private Sensor sensorPhGymSharckPileta1;
    private Sensor sensorTempGymSharckPileta1;

    //Reglas
    private Regla reglaEncenderTermoAbajoDe17Grados;
    private Regla reglaApagarTermoArribaDe30Grados;
    private Regla reglaNoHacerNadaTempIgualA26Grados;

    private Regla reglaAbrirCloroMenosDe3pH;
    private Regla reglaCerrarCloroMasDe8pH;

    //Acciones
    private Accion accionEncenderTermo;
    private Accion accionApagarTermo;
    private Accion accionNoHacerNadaConTermo;

    private Accion accionAbrirCloro;
    private Accion accionCerrarCloro;

    //Alarmas
    private Alarma alarmaTemperaturaMenorA17Grados;
    private Alarma alarmaTemperaturaMayorA30Grados;
    private Alarma alarmaNoHacerNadaTempIgualA26Grados;

    private Alarma alarmaAcidezMenorA3pH;
    private Alarma alarmaAcidezMayorA8pH;

    //Usuarios
    private Usuario usuarioUno;
    private Usuario usuarioDos;

    //Actuadores
    private Termotanque unTermo;
    private TanqueCloro unTanqueCloro;


    //Mail


    @Before
    public void init(){

        //Gyms
        this.gimnasioMadyson = new Gimnasio(1,"Madyson","Calle siempre viva 123",47456892);
        this.gimnasioSharck = new Gimnasio(2,"Sharck","Libertador 1200",45123257);

        //Piletas
        this.gymMadysonPileta1 = new Pileta(1,"Piso 2", gimnasioMadyson);
        this.gymMadysonPileta2 = new Pileta(2,"Planta baja",gimnasioMadyson);

        this.gymSharckPileta1 = new Pileta(1,"Piso 1", gimnasioSharck);
        this.gymSharckPileta2 = new Pileta(2,"Planta 3",gimnasioSharck);


        //Sensores
        this.sensorPhGymMadysonPileta1 = new Sensor(1,"Acidez",gymMadysonPileta1);
        this.sensorTempGymMadysonPileta1 = new Sensor(2,"Temperatura",gymMadysonPileta1);

        this.sensorPhGymSharckPileta1 = new Sensor(1,"Acidez",gymSharckPileta1);
        this.sensorTempGymSharckPileta1 = new Sensor(2,"Temperatura",gymSharckPileta1);

        //Acciones
        this.accionEncenderTermo = new Accion(1,"Encender Termo");
        this.accionApagarTermo = new Accion(1,"Apagar Termo");
        this.accionNoHacerNadaConTermo = new Accion(1,"No hacer nada");

        this.accionAbrirCloro = new Accion(1,"Abrir cloro");
        this.accionCerrarCloro = new Accion(1,"Cerrar cloro");

        //Reglas
        this.reglaEncenderTermoAbajoDe17Grados = new Regla(1,"Encender termo cuando esta abajo de los 17 grados",17.0, sensorTempGymMadysonPileta1, accionEncenderTermo, Condicion.MENOR);
        this.reglaApagarTermoArribaDe30Grados = new Regla(2,"Apagar termo cuando pasa los 30 grados",30.0, sensorTempGymMadysonPileta1, accionApagarTermo, Condicion.MAYOR);
        this.reglaNoHacerNadaTempIgualA26Grados = new Regla(3,"No se hara nada si la temperatura es igual a 26 grados",26.0,sensorTempGymMadysonPileta1,accionNoHacerNadaConTermo,Condicion.IGUAL);

        this.reglaAbrirCloroMenosDe3pH = new Regla(4,"Abrir suministro de cloro cuando hay una acidez menor a 3pH",3.0, sensorTempGymMadysonPileta1, accionApagarTermo, Condicion.MENOR);
        this.reglaCerrarCloroMasDe8pH = new Regla(5,"Cerrar suministro de cloro cuando hay una acidez menor a 8pH",8.0, sensorTempGymMadysonPileta1, accionApagarTermo, Condicion.MAYOR);


        //Alarmas
        this.alarmaTemperaturaMenorA17Grados = new Alarma(1,"La temperatura es menor a 17 grados, se encendera el termotanque",usuarioUno);
        this.alarmaTemperaturaMayorA30Grados = new Alarma(2,"La temperatura es mayor a 30 grados, se apagara el termotanque",usuarioUno);
        this.alarmaNoHacerNadaTempIgualA26Grados = new Alarma(3,"La temperatura es la adecuada, despreocupese",usuarioUno);

        this.alarmaAcidezMenorA3pH = new Alarma(4,"La acidez es menor a 3pH, se suministrara cloro",usuarioDos);
        this.alarmaAcidezMayorA8pH = new Alarma(5,"La acidez es mayor a 8pH, se cerrara el suministro de cloro",usuarioDos);


        //Usuarios
        this.usuarioUno = new Usuario("Julian","Gonzalez","jul449","julyhindu_4@hotmail.com");
        this.usuarioDos = new Usuario("Mathias","Tejeda","tej321","julyhindu_4@hotmail.com");

        //Actuadores
        this.unTermo = new Termotanque("Termotanque",false);
        this.unTanqueCloro = new TanqueCloro("Tanque de cloro",false);

    }

    //-------------------------------------------------------CHEQUEO DE LISTAS-------------------------------------------------------
    @Test
    public void agregarUsuarioAGimnasio(){
        gimnasioMadyson.agregarUsuario(usuarioUno);
        gimnasioMadyson.agregarUsuario(usuarioDos);
        Assert.assertEquals(2,gimnasioMadyson.contarCantidadUsuarios());
    }

    @Test
    public void agregarPiletasAGimnasio(){
        gimnasioSharck.agregarPileta(gymMadysonPileta1);
        gimnasioSharck.agregarPileta(gymMadysonPileta2);
        Assert.assertEquals(2,gimnasioSharck.contarCantidadPiletas());
    }

    @Test
    public void agregarReglasASensor(){
        sensorTempGymMadysonPileta1.agregarRegla(reglaEncenderTermoAbajoDe17Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaApagarTermoArribaDe30Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaNoHacerNadaTempIgualA26Grados);
        Assert.assertEquals(3,sensorTempGymMadysonPileta1.contarCantidadReglas());
    }

    //-------------------------------------------------------CHEQUEO DE REGLAS-------------------------------------------------------
    @Test
    public void chequearCumplimientoReglaTempMenorA17GradosYNoMayorA30(){
        sensorTempGymMadysonPileta1.agregarRegla(reglaEncenderTermoAbajoDe17Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaApagarTermoArribaDe30Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaNoHacerNadaTempIgualA26Grados);
        sensorTempGymMadysonPileta1.setValor(16.9);
        sensorTempGymMadysonPileta1.recibirMedicion(sensorTempGymMadysonPileta1.getValor());
        Assert.assertTrue(reglaEncenderTermoAbajoDe17Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaApagarTermoArribaDe30Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaNoHacerNadaTempIgualA26Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
    }

    @Test
    public void chequearCumplimientoReglaTempMayorA30GradosYNoMenorA17(){
        sensorTempGymMadysonPileta1.agregarRegla(reglaEncenderTermoAbajoDe17Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaApagarTermoArribaDe30Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaNoHacerNadaTempIgualA26Grados);
        sensorTempGymMadysonPileta1.setValor(30.1);
        sensorTempGymMadysonPileta1.recibirMedicion(sensorTempGymMadysonPileta1.getValor());
        Assert.assertTrue(reglaApagarTermoArribaDe30Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaEncenderTermoAbajoDe17Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaNoHacerNadaTempIgualA26Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
    }

    @Test
    public void chequearCumplimientoReglaTempIgualA26Grados(){
        sensorTempGymMadysonPileta1.agregarRegla(reglaEncenderTermoAbajoDe17Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaApagarTermoArribaDe30Grados);
        sensorTempGymMadysonPileta1.agregarRegla(reglaNoHacerNadaTempIgualA26Grados);
        sensorTempGymMadysonPileta1.setValor(26.0);
        sensorTempGymMadysonPileta1.recibirMedicion(sensorTempGymMadysonPileta1.getValor());
        Assert.assertTrue(reglaNoHacerNadaTempIgualA26Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaApagarTermoArribaDe30Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
        Assert.assertFalse(reglaEncenderTermoAbajoDe17Grados.soyCumplida(sensorTempGymMadysonPileta1.getValor()));
    }

    //-------------------------------------------------------CHEQUEO DE ALERTAS-------------------------------------------------------


    @Test
    public void chequearUsuarioLogeadoRecibeAlerta(){
        usuarioUno.setLogeado(true);
        sensorTempGymMadysonPileta1.agregarRegla(reglaEncenderTermoAbajoDe17Grados);
        sensorTempGymMadysonPileta1.setValor(16.9);
        sensorTempGymMadysonPileta1.recibirMedicion(sensorTempGymMadysonPileta1.getValor());
        accionEncenderTermo.setUnActuador(unTermo);
        accionEncenderTermo.setAlarma(alarmaTemperaturaMenorA17Grados);
        alarmaTemperaturaMenorA17Grados.setUnUsuario(usuarioUno);
        Assert.assertFalse(unTermo.isEstado());
        accionEncenderTermo.activarAlarma();
        Assert.assertTrue(unTermo.isEstado());
    }

    @Test
    public void chequearUsuarioDeslogeadoRecibeAlerta(){
        sensorPhGymMadysonPileta1.agregarRegla(reglaAbrirCloroMenosDe3pH);
        sensorPhGymMadysonPileta1.setValor(2.5);
        sensorPhGymMadysonPileta1.recibirMedicion(sensorPhGymMadysonPileta1.getValor());
        accionAbrirCloro.setUnActuador(unTanqueCloro);
        accionAbrirCloro.setAlarma(alarmaAcidezMenorA3pH);
        alarmaAcidezMenorA3pH.setUnUsuario(usuarioDos);
        Assert.assertFalse(unTanqueCloro.isEstado());
        accionAbrirCloro.activarAlarma();
        Assert.assertTrue(unTanqueCloro.isEstado());
    }

}
