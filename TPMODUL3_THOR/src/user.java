class user {
    protected String nama;
    protected int id;

    public user(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getUserDetails() {
        return "Name: " + nama + ", ID: " + id;
    }
}