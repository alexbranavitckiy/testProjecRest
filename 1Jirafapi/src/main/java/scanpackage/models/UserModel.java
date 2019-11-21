package scanpackage.models;

public class UserModel {

        private long idUsers;
        private String Name;
        private int role;

        public long getIdUsers() {
            return idUsers;
        }

        public void setIdUsers(long idUsers) {
            this.idUsers = idUsers;
        }

        public String getName() {
            return Name;
        }

        public void setName(String firstName) {
            this.Name = firstName;
        }


        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

}
