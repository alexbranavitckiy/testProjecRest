export class Project {
  id: string;
  address: string;
  username: string;
  email: string;

  static cloneBase(project: Project): Project {
    let clonedBillingAccount: Project = new Project();
    clonedBillingAccount.id = project.id;
    clonedBillingAccount.username = project.username;
    clonedBillingAccount.email = project.email;
    clonedBillingAccount.address = project.address;
    return clonedBillingAccount;
  }

}
