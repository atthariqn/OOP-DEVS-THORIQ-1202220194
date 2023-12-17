class teacher extends user {
    private String courseTaught;

    public teacher(String nama, int id, String courseTaught) {
        super(nama, id);
        this.courseTaught = courseTaught;
    }

    public void teachClass() {
        System.out.println(nama + " is teaching " + courseTaught);
    }

    @Override
    public String getUserDetails() {
        return "Teacher - " + super.getUserDetails();
    }
}
