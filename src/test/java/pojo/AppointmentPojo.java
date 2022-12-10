

public class AppointmentPojo {

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String endDate;
    private String status;
    private Object anamnesis;
    private Object treatment;
    private Object diagnosis;
    private Object prescription;
    private Object description;
    private Object physician;
    private PatientPojo patient;
    private Object ctests;

    public AppointmentPojo() {
    }

    public AppointmentPojo(String createdBy, String createdDate, Integer id, String startDate, String endDate, String status, Object anamnesis, Object treatment, Object diagnosis, Object prescription, Object description, Object physician, PatientPojo patient, Object ctests) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.physician = physician;
        this.patient = patient;
        this.ctests = ctests;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(Object anamnesis) {
        this.anamnesis = anamnesis;
    }

    public Object getTreatment() {
        return treatment;
    }

    public void setTreatment(Object treatment) {
        this.treatment = treatment;
    }

    public Object getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Object diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Object getPrescription() {
        return prescription;
    }

    public void setPrescription(Object prescription) {
        this.prescription = prescription;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getPhysician() {
        return physician;
    }

    public void setPhysician(Object physician) {
        this.physician = physician;
    }

    public PatientPojo getPatient() {
        return patient;
    }

    public void setPatient(PatientPojo patient) {
        this.patient = patient;
    }

    public Object getCtests() {
        return ctests;
    }

    public void setCtests(Object ctests) {
        this.ctests = ctests;
    }

    @Override
    public String toString() {
        return "AppointmentPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis=" + anamnesis +
                ", treatment=" + treatment +
                ", diagnosis=" + diagnosis +
                ", prescription=" + prescription +
                ", description=" + description +
                ", physician=" + physician +
                ", patient=" + patient +
                ", ctests=" + ctests +
                '}';
    }
}
