package scheduler.model;

import java.util.Date;
import java.util.List;

public class Meeting extends Schedule {
	private Integer room_id;
	private Integer emp_id;
	private String meetingDescription;
	private List<Employee> attendee;
	private List<String> accept;
	private Room rom;
	private Employee host;
	
	public Meeting() {
		
	}
	
	public Meeting(Integer room_id, Integer emp_id, String meetingDescription) {
		super();
		this.room_id = room_id;
		this.emp_id = emp_id;
		this.meetingDescription = meetingDescription;
	}
	
	public Meeting(Integer sch_id, Integer emp_id) {
		super(sch_id);
		this.emp_id = emp_id;
	}
	

	public Meeting(Integer sch_id, Date startTime, Date endTime) {
		super(sch_id, startTime, endTime);
		// TODO Auto-generated constructor stub
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getMeetingDescription() {
		return meetingDescription;
	}

	public void setMeetingDescription(String meetingDescription) {
		this.meetingDescription = meetingDescription;
	}

	public List<Employee> getAttendee() {
		return attendee;
	}

	public void setAttendee(List<Employee> attendee) {
		this.attendee = attendee;
	}

	public List<String> getAccept() {
		return accept;
	}

	public void setAccept(List<String> accept) {
		this.accept = accept;
	}

	public Room getRom() {
		return rom;
	}

	public void setRom(Room rom) {
		this.rom = rom;
	}

	public Employee getHost() {
		return host;
	}

	public void setHost(Employee host) {
		this.host = host;
	}

	
}
