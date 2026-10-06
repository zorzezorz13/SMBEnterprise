package rs.ac.university.gradjevinaAplikacija.Entity;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.ac.university.gradjevinaAplikacija.Entity.Image;


@Entity(name="item")
@Getter
@Setter
@NoArgsConstructor
public class Item {

	@Id 
	@Column(name="itemId")
	@JsonFormat
	private Integer id;
	@Column(name="text")
	private String text;
	@Column(name="description")
	private String description;
	@Column(name="projectTime")
	private String projectTime;
	@Column(name="image")
	private Image image;

}