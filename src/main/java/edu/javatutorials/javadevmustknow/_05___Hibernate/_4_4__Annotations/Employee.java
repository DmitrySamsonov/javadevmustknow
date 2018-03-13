package edu.javatutorials.javadevmustknow._05___Hibernate._4_4__Annotations;

import javax.persistence.*;

/*
All the metadata is clubbed into the POJO_java_file along with the code,
this helps the user to understand the table structure and POJO simultaneously during the development.
*/

/*
 * @Entity Annotation
 * The EJB 3 standard annotations are contained in the javax.persistence package,
 * so we import this package as the first step.
 * Second, we used the @Entity annotation to the Employee class, which marks this class as an entity bean,
 * so it must have a no-argument constructor that is visible with at least protected scope.
 */

/*
 * @Table Annotation
 * The @Table annotation allows you to specify the details of the table
 * that will be used to persist the entity in the database.
 *  
 * The @Table annotation provides four attributes,
 * allowing you to override the name of the table, its catalogue, and its schema,
 * and enforce unique constraints on columns in the table.
 */

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    /*
     * @Id and @GeneratedValue Annotations
     * Each entity bean will have a primary key,
     * which you annotate on the class with the @Id annotation.
     * The primary key can be a single field or a combination of multiple fields depending on your table structure.
     *  
     * By default, the @Id annotation will automatically determine
     * the most appropriate primary key generation strategy to be used
     * but you can override this by applying the @GeneratedValue annotation,
     * which takes two parameters strategy="" and generator=""
     * <p>
     * Letting Hibernate determine which generator type to use
     * makes your code portable between different databases.
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


    /*
     * @Column Annotation
     * The @Column annotation is used to specify the details of the column
     * to which a field or property will be mapped.
     * You can use @Column annotation with the following most commonly used attributes −
     *  
     * ♦ name="" attribute permits the name of the column
     * to be explicitly specified.
     *  
     * ♦ length="" attribute permits the size of the column
     * used to map a value ( particularly for a String value ).
     *  
     * ♦ nullable="" attribute permits the column
     * to be marked NOT NULL when the schema is generated.
     *  
     * ♦ unique="" attribute permits the column
     * to be marked as containing only unique values.
     */
    @Column(name = "first_name", length = 250)
    private String firstName;

    @Column(name = "last_name", unique = true)
    private String lastName;

    @Column(name = "salary")
    private int salary;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}