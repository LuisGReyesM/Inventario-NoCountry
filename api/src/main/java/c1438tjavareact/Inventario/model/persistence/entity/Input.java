package c1438tjavareact.Inventario.model.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "inputs")
public class Input {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "entry_date")
	private Date entryDate;

	@NotNull
	private Integer quantity;

	@ManyToOne
	@JoinColumn(name = "brach_id")
	private Branch branch;

	@OneToMany(mappedBy = "entry", cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();

}