package iterator;

/**
 * Содержит список параметров, которые надо итерировать - скиллы
 * @author alkl1m
 */
public class JavaDev implements Collection {
    private String name;
    private String[] skills;

    public JavaDev(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /**
     * Вложенный класс реализующий итератор
     */
    private class SkillIterator implements Iterator {
        private int index;

        SkillIterator() {
        }

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
