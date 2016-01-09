package ca.dhsoftware.esp.profile;

/**
 * Conditions are the second most important aspect of the app. Once a sound profile is
 * created it's essentially useless on it's own unless you have some automated way
 * to enable/disable it. Conditions will be those things that are automatically evaluated to
 * see if a profile should be activated.
 *
 * If the sound profile is the "what should happen" the conditions are the "when it should happen".
 *
 * Created by dinkoharbinja on 15-07-28.
 */
public interface Condition {
    boolean evaluate();
}
