package pl.sda.consumingService.consumingService.dtos;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EventDto {
    private Long id;
    private String title;
    private String body;
    private String startDate;
    private String endDate;

    public EventDto() {
    }

    public EventDto(Long id, String title, String body, String startDate, String endDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
