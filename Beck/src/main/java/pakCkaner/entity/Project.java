package pakCkaner.entity;



import javax.persistence.*;
import java.util.Objects;

    @Entity
    @Table(name = "billing_account")
    public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String address;
        private String username;
        private String email;

        public Project(String address, String username, String email) {
            this.address = address;
            this.username = username;
            this.email = email;
        }

        public Project() {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Project that = (Project) o;
            return id == that.id &&
                    Objects.equals(address, that.address) &&
                    Objects.equals(username, that.username) &&
                    Objects.equals(email, that.email);
        }

        @Override
        public int hashCode() {

            return Objects.hash(id, address, username, email);
        }

        @Override
        public String toString() {
            return "BillingAccount{" +
                    "id=" + id +
                    ", address='" + address + '\'' +
                    ", username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

    }
