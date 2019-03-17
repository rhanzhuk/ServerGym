package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.Series;
import serverPhotos.repository.SeriesRepository;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    SeriesRepository seriesRepository;

    public Series getSeries(Long id){
        return seriesRepository.getOne(id);
    }

    public List<Series> getAll(){
        return seriesRepository.findAll();
    }

    public Series saveSeries(Series series){
        return seriesRepository.save(series);
    }

    public Series updateSeries(Series series){
        return seriesRepository.saveAndFlush(series);
    }

    public Series deleteSeries(Series series){
        seriesRepository.delete(series);
        return series;
    }

    public void deleteSeriesById(Long id){
        seriesRepository.deleteById(id);
    }
}