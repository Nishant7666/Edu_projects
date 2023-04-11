package new_projectt;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class dto_entity
{
	@Id
	// for oracle														//identity for mysql
	@GeneratedValue(generator="product_seq" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "product_seq" , initialValue = 1 , allocationSize = 1)
	private int id;
	
	@Column(name="name" , length = 50 , unique = true , nullable = false)
	private String title;
	
	
	private String create_task;
	
	private String status;
	
	@CreationTimestamp // insert the system date automatically while inserting data
	private LocalDateTime create_ts;
	
	@UpdateTimestamp 
	private LocalDateTime update_ts;
	
	@Transient
	private double totalprice;
	
	public LocalDateTime getCreate_ts() {
		return create_ts;
	}
	public void setCreate_ts(LocalDateTime create_ts) {
		this.create_ts = create_ts;
	}
	public LocalDateTime getUpdate_ts() {
		return update_ts;
	}
	public void setUpdate_ts(LocalDateTime update_ts) {
		this.update_ts = update_ts;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreate_task() {
		return create_task;
	}
	public void setCreate_task(String create_task) {
		this.create_task = create_task;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
