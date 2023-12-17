import java.util.ArrayList;

class student extends user {
    protected ArrayList<String> enrolledCourses;

    public student(String nama, int id) {
        super(nama, id);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        String userDetails = "Student - " + super.getUserDetails() + "\nEnrolled Courses: ";
        for (String course : enrolledCourses) {
            userDetails += course + ", ";
        }
    
        userDetails = userDetails.substring(0, userDetails.length() - 2);
        return userDetails;
    }
}
