package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Series;
import serverPhotos.service.SeriesService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SeriesController {

    @Autowired
    SeriesService seriesService;

    @GetMapping("/series/{id}")
    public Series getSeries(@PathVariable (value = "id") Long id){
        return seriesService.getSeries(id);
    }

    @GetMapping("/serieses")
    public List<Series> getAllSeries(){
        return seriesService.getAll();
    }

    @PostMapping("/series")
    public Series saveSeries(@Valid @RequestBody Series series){
        return seriesService.saveSeries(series);
    }

    @PutMapping("/series/{id}")
    public Series updateSeries(@PathVariable(value = "id")Long id, @Valid @RequestBody Series series){
        return seriesService.updateSeries(id,series);
    }

    @DeleteMapping("/series")
    public Series deleteSeries(@Valid @RequestBody Series series){
        return seriesService.deleteSeries(series);
    }

    @DeleteMapping("/series/{id}")
    public void deleteServiceById(@PathVariable(value = "id") Long id){
        seriesService.deleteSeriesById(id);
    }
}
