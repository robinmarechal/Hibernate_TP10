package app.models;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import libs.DayTime;
import libs.mvc.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Scene extends Model
{
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty description = new SimpleStringProperty();

    private ObjectProperty<DayTime> daytime = new SimpleObjectProperty<>();

    private ObjectProperty<Place> place = new SimpleObjectProperty<>();

    private ObjectProperty<Movie> movies = new SimpleObjectProperty<>();

    private ListProperty<Setup> setups = new SimpleListProperty<>();

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int getId ()
    {
        return id.get();
    }

    @Column
    public String getDescription ()
    {
        return description.get();
    }

    @Column
    public DayTime getDaytime ()
    {
        return daytime.get();
    }

    @ManyToOne
    public Place getPlace ()
    {
        return place.get();
    }

    @ManyToOne
    public Movie getMovies ()
    {
        return movies.get();
    }


    @OneToMany (cascade = CascadeType.DETACH, fetch = FetchType.LAZY, targetEntity = Setup.class, mappedBy = "scene")
    public List<Setup> getSetups ()
    {
        return setups.get();
    }

    public IntegerProperty idProperty ()
    {
        return id;
    }

    public StringProperty descriptionProperty ()
    {
        return description;
    }

    public ObjectProperty<DayTime> daytimeProperty ()
    {
        return daytime;
    }

    public ObjectProperty<Place> placeProperty ()
    {
        return place;
    }

    public ObjectProperty<Movie> filmProperty ()
    {
        return movies;
    }

    public ListProperty<Setup> setupsProperty ()
    {
        return setups;
    }

    public void setId (int id)
    {
        this.id.set(id);
    }

    public void setDescription (String description)
    {
        this.description.set(description);
    }

    public void setDaytime (DayTime daytime)
    {
        this.daytime.set(daytime);
    }

    public void setPlace (Place place)
    {
        this.place.set(place);
    }

    public void setMovies (Movie film)
    {
        this.movies.set(film);
    }

    public void setSetups (List<Setup> setups)
    {
        this.setups.set(FXCollections.observableList(setups));
    }
}