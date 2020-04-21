package com.kodilla.kodillalibrary.mapper;

import com.kodilla.kodillalibrary.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {

    public Reader mapToReader(final ReaderDto readerDto) {
        return new Reader(
                readerDto.getName(),
                readerDto.getSurname());
    }

    public ReaderDto mapToReaderDto(final Reader reader) {
        return new ReaderDto(
                reader.getName(),
                reader.getSurname());
    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readerList) {
        return readerList.stream()
                .map(x -> new ReaderDto(x.getName(), x.getSurname()))
                .collect(Collectors.toList());
    }
}
