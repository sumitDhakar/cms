

import java.sql.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LeaveApplications {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  
	private Integer id;
	
	private Date startDate;
	
	private Date endDate;
	
	private Double totalHours;
	
	private Double totalDays;
	@ManyToOne
	private LeaveTypes leaveTypeId;
	@ManyToOne
	private Users applicantId;
	
	private String reason;
	
	private Integer createdBy;
	
	private Users checkedBy;
	
	@CreatedDate
	private Date createdAt; 
	
	
	private Date checkedAt; 
	//enum
	private String status="New"; 
	
	private Boolean deleted; 
}




