/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliduan;

/**
 *
 * @author Admin
 */
public class Task extends Project{
    private String projectId;
    private String developerIds;
    private String testerIds;
    private String createdDate;
    private String endDate;
    private static final String[] status = {"Created", "Assigned", "Started", "Completed", "Done", "Reject", "Closed"};
}
