import rs.ac.university.gradjevinaAplikacija.Entity.Image;


@Entity(name="item")
@Getter
@Setter
@NoArgsConstructor
public class Item {

	@Column(name="itemId")
	@JsonFormat
	private Integer id;
	@Column(name="text")
	@JsonFormat
	private String text;
	@Column(name="description")
	private String description;
	@Column(name="projectTime")
	private String projectTime;
	@Column(name="image")
	private Image image;

}