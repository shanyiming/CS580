package scheduler.gui;

import java.awt.CardLayout;

import javax.swing.JPanel;

import scheduler.model.EmployeeModel;

public class SchedulerPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9080511466439268522L;
	private CardLayout cardLayout;
	private LoginPanel loginPanel;
	private HomePanel homePanel;
	private MeetingPanel meetingPanel;
	private TimePanel timePanel;
	private RoomPanel roomPanel;
	private MeetingDetailsPanel detailsPanel;
	private AdministratorPanel adminPanel;
	private ProfilePanel profilePanel;
	private EmployeeModel employeeModel;
	
	public SchedulerPanel(){
		cardLayout = new CardLayout();
		this.setLayout(cardLayout);
		employeeModel = new EmployeeModel();
		loginPanel = new LoginPanel();
		homePanel = new HomePanel();
		loginPanel.setModel(employeeModel);
		homePanel.setModel(employeeModel);
		meetingPanel = new MeetingPanel();
		timePanel = new TimePanel();
		roomPanel = new RoomPanel();
		detailsPanel = new MeetingDetailsPanel();
		adminPanel = new AdministratorPanel();
		profilePanel = new ProfilePanel();
		
		this.add(loginPanel, "login");
		this.add(homePanel, "home");
		this.add(meetingPanel, "meeting");
		this.add(timePanel, "time");
		this.add(roomPanel, "room");
		this.add(detailsPanel, "meetingDetails");
		this.add(adminPanel, "adminHome");
		this.add(profilePanel, "profile");
	}
}
