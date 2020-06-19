package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "projects")
@NamedQueries({
    @NamedQuery(
            name = "getAllProject",
            query = "SELECT e FROM Project AS e ORDER BY e.id DESC"
            ),
    @NamedQuery(
            name = "getProjectCount",
            query = "SELECT COUNT(e) FROM Employee AS e"
            ),
})
@Entity
public class Project {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "project_id", nullable = false, unique = true)
    private String project_id;

    @Column(name = "project_name", nullable = false, unique = true)
    private String project_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_id;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
}
