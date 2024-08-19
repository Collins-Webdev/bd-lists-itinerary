package com.amazon.ata.lists;

import com.amazon.ata.resources.lists.prework.Destination;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing travel itinerary. The basic functionality it supports is to add, get or remove
 * a destination. Additionally, it allows a user to get a list of locations that are going to be visited
 * and get the total number of days that will be spent in trip.
 */
public class Itinerary {
    // Member variable to store the list of destinations
    private List<Destination> destinations;

    // Constructor
    public Itinerary() {
        this.destinations = new ArrayList<>();
    }

    /**
     * Add a new destination to the end of itinerary.
     *
     * @param destination destination to add to itinerary
     */
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    /**
     * Get the destination from itinerary based on its position.
     *
     * @param position position of destination to retrieve.
     * @return Destination at position.
     */
    public Destination getDestination(int position) {
        return destinations.get(position);
    }

    /**
     * Remove a destination from itinerary based on its position.
     *
     * @param position position of destination to remove.
     * @return destination that was removed from itinerary.
     */
    public Destination removeDestination(int position) {
        return destinations.remove(position);
    }

    /**
     * Get list of locations (cities) in the order in which they
     * appear in the itinerary.
     *
     * @return full list of locations from itinerary.
     */
    public List<String> getListOfLocations() {
        List<String> locations = new ArrayList<>();
        for (Destination destination : destinations) {
            locations.add(destination.getLocation());
        }
        return locations;
    }

    /**
     * Get total number of days spent on the trip planned by the
     * itinerary.
     *
     * @return total number of days spent in all locations.
     */
    public int getTotalNumberOfDays() {
        int totalDays = 0;
        for (Destination destination : destinations) {
            totalDays += destination.getDaysAtLocation(); // Remplacement par getDaysAtLocation()
        }
        return totalDays;
    }

    /**
     * Get number of destinations contained in itinerary.
     *
     * @return number of destinations contained in itinerary.
     */
    public int getNumberOfDestinations() {
        return destinations.size();
    }
}
