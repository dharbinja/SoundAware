package ca.dhsoftware.esp.profile;

import java.util.ArrayList;

/**
 * The profile is the main concept of the Application. The user will create a set of
 * profiles that will execute based on some conditions.
 *
 * Created by dinkoharbinja on 15-07-28.
 */
public class Profile {
    protected String name;
    protected boolean enabled;
    protected ArrayList<Condition> conditions;

    public Profile(String name)
    {
        this.name = name;
        this.enabled = false;
        this.conditions = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void addCondition(Condition condition) {
        this.conditions.add(condition);
    }
}
