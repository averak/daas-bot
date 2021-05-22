package dev.abelab.daas.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;

import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.db.mapper.DajareMapper;

class DajareRepositoryTest {

	@Injectable
	DajareMapper dajareMapper;

	@Tested
	DajareRepository dajareRepository;

	Dajare dajareSample = Dajare.builder() //
			.id(anyInt()) //
			.text(anyString()) //
			.isDajare(true) //
			.score(4.0) //
			.reading(anyString()) //
			.build();

	@Test
	void 正_ダジャレを保存する() {
		new Expectations(this.dajareRepository) {
			{
				dajareRepository.insert(dajareSample);
				result = dajareSample.getId();
			}
		};

		assertThat(this.dajareRepository.insert(this.dajareSample)).isEqualTo(this.dajareSample.getId());
	}

	@Test
	void 正_ダジャレが存在する() {
		new Expectations(this.dajareRepository) {
			{
				dajareRepository.selectById(dajareSample.getId());
				result = dajareSample;
			}
		};

		assertThat(this.dajareRepository.selectById(dajareSample.getId())) //
				.extracting("id", "text", "isDajare", "score", "reading") //
				.containsExactly( //
						this.dajareSample.getId(), //
						this.dajareSample.getText(), //
						this.dajareSample.getIsDajare(), //
						this.dajareSample.getScore(), //
						this.dajareSample.getReading() //
				);
	}

	@Test
	void 異_ダジャレが存在しない() {
		new Expectations(this.dajareRepository) {
			{
				dajareRepository.selectById(dajareSample.getId());
				result = null;
			}
		};

		assertThat(this.dajareRepository.selectById(dajareSample.getId())).isNull();
	}
}
