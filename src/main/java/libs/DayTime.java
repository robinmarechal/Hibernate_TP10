package libs;

import java.io.Serializable;

/**
 * Enum containing the day time possibilities
 */
public enum DayTime implements Serializable
{
    NIGHT("Night"),
    DAY("Day"),
    NULL("");

    private String value;

    DayTime (String value)
    {
        this.value = value;
    }

    @Override
    public String toString ()
    {
        return this.value;
    }
}
