public class Visita<Hospital> {


    private String CodVisita;

    private  String fechaHora;

    private  Hospital hospital;

    private Medico medico;

    private String diagnostico;

    private  String tratamientos;

    private  int numeroCama;

    private  String fechaSadlida;

   private HistorialMedico historialMedico;


    public Visita(String codVisita, String fechaHora, Hospital hospital, Medico medico, String diagnostico, String tratamientos, int numeroCama, String fechaSadlida, HistorialMedico historialMedico) {
        CodVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numeroCama = numeroCama;
        this.fechaSadlida = fechaSadlida;
        this.historialMedico = historialMedico;
    }


    public String getCodVisita() {
        return CodVisita;
    }

    public void setCodVisita(String codVisita) {
        CodVisita = codVisita;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public String getFechaSadlida() {
        return fechaSadlida;
    }

    public void setFechaSadlida(String fechaSadlida) {
        this.fechaSadlida = fechaSadlida;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }






}
