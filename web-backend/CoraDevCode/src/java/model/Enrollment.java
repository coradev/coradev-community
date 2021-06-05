package model;

public class Enrollment {

    private int id, studentId, courseId;
    private boolean isPaidSubscription;
    private String studentName, courseBought;
    private float fee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean isIsPaidSubscription() {
        return isPaidSubscription;
    }

    public void setIsPaidSubscription(boolean isPaidSubscription) {
        this.isPaidSubscription = isPaidSubscription;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseBought() {
        return courseBought;
    }

    public void setCourseBought(String courseBought) {
        this.courseBought = courseBought;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

}
